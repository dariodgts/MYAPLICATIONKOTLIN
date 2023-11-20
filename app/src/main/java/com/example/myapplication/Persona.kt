package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

class Persona(var nombre: String, var apellido: String, val id: Int, val edad:Int, var sexo: String) :
    Parcelable {




    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeInt(id)
        parcel.writeInt(edad)
        parcel.writeString(sexo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Persona> {
        fun createFromPersona(parcel: Parcel) {
            val nombre = null
            return Persona(nombre.toString())
        }

        private fun Persona(nombre: String) {
return println("Estamos trabajando con clases")
        }

        override fun createFromParcel(source: Parcel?): Persona {
            TODO("Not yet implemented")
        }


        override fun newArray(size: Int): Array<Persona?> {
            return arrayOfNulls(size)
        }
    }

}