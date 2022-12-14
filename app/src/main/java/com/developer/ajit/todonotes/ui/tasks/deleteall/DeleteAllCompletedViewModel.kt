package com.developer.ajit.todonotes.ui.tasks.deleteall

import androidx.lifecycle.ViewModel
import com.developer.ajit.todonotes.data.TaskDao
import com.developer.ajit.todonotes.di.ApplicationScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DeleteAllCompletedViewModel @Inject constructor(
    private val dao: TaskDao,
    @ApplicationScope private val applicationScope: CoroutineScope
) : ViewModel() {

    fun onConfirmClick() = applicationScope.launch {
        dao.deleteCompletedTask()
    }

}