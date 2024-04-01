package com.iesam.ex_22_23_aad_marzo.feature.offers.data.remote
import com.google.firebase.database.PropertyName
data class OffersDbRemoteModel(
    @get:PropertyName("id") @set:PropertyName("id") var id: Int =0,
    @get:PropertyName("title") @set:PropertyName("title") var title: String ="",
    @get:PropertyName("description") @set:PropertyName("description") var description: String ="",

)