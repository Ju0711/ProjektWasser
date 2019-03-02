//Wie viel Wasser haben sie getrunken
package com.example.wasser

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.app.AlertDialog
import android.text.InputType
import android.widget.EditText
import java.lang.IllegalStateException

class HowWasser : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder? = activity?.let {
            AlertDialog.Builder(it)
        }
        builder?.setMessage("Menge in ml eintragen")
            ?.setTitle("Wassermenge")

        val inputText: EditText = EditText(activity)
        inputText.setInputType(InputType.TYPE_CLASS_NUMBER)
        builder?.setView(inputText)

        //Buttons
        builder?.setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, which -> })
        builder?.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which -> getDialog().cancel() })





        return builder?.create() ?: throw IllegalStateException("Null not Possible")


    }
}