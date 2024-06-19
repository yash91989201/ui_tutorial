package com.example.uitutorial

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.PopupMenu

class CustomMenu {

    fun showMenu(context:Context,view:View){
        // create PopupMenu view
        val pop=PopupMenu(context,view)
        // inflate a menu layout file into the popup view
        pop.inflate(R.menu.switch_activity_menu)
        // define on click actions according to id's of menu list item
        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.toastActivity-> {
                    val intent=Intent(context,Toast::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.alertActivity-> {
                    val intent=Intent(context,LearnAlertDialog::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.sweetAlertActivity-> {
                    val intent=Intent(context,SweetAltertDialog::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.webViewActivity-> {
                    val intent=Intent(context,LearnWebView::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.gridLayoutActivity-> {
                    val intent=Intent(context,LearnGridLayout::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.learnFragmentActivity-> {
                    val intent=Intent(context,LearnFragment::class.java)
                    context.startActivity(intent)
                    true
                }
                else -> false
            }
        }

        try {

            val fieldPopup=PopupMenu::class.java.getDeclaredField("mPopup")
            fieldPopup.isAccessible=true
            val mPopup=fieldPopup.get(pop)
            mPopup
                .javaClass
                .getDeclaredMethod("setFocusShowIcon",Boolean::class.java)
                .invoke(mPopup,true)

        }catch (e:Exception){
            Log.d("Popup","menu failed")
        }
        finally {
            pop.show()
        }
    }

}