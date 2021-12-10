package id.ayurizkyamalia.marsphotos.overview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OverviewViewModel : ViewModel() {

    // The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<String>()

    // The external immutable LiveData for the request status
    val status: LiveData<String> = _status
    init {
        getMarsPhotos()
    }


    private fun getMarsPhotos() {
        _status.value = "Set the Mars API status response here!"
    }
}
