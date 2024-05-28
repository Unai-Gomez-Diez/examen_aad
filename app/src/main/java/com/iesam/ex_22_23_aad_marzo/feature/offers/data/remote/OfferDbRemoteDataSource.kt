package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer
import kotlinx.coroutines.tasks.await

class OfferDbRemoteDataSource(
    private val firebase: FirebaseDatabase
) {
    fun obtainOffers(): List<Offer>{
        val datos = firebase.getReference("")
            .get().result
            .children.map {
                it.getValue(OffersDbRemoteModel::class.java)!!.toDomain()
            }
        //Log.d("@dev", datos.toString())
        return datos
    }
}