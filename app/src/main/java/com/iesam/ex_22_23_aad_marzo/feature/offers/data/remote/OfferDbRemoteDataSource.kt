package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote

import com.google.firebase.database.FirebaseDatabase
import com.iesam.ex_22_23_aad_marzo.feature.offers.domain.Offer
import kotlinx.coroutines.tasks.await

class OfferDbRemoteDataSource(
    private val firebase: FirebaseDatabase
) {
    suspend fun obtainOffers(): List<Offer>{
        return firebase.getReference("")
            .get()
            .await()
            .children.map {
                it.getValue(OffersDbRemoteModel::class.java)!!.toDomain()
            }
    }
}