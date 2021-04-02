package com.satancros.salehere.main

import android.util.Log
import com.satancros.salehere.constants.Constant
import dev.icerock.moko.socket.Socket
import dev.icerock.moko.socket.SocketEvent
import dev.icerock.moko.socket.SocketOptions

class MainWorker {

    fun emit(
        onSuccess: (data: String) -> Unit,
        onFailure: (error: Throwable) -> Unit
    ) {
        val socket = Socket(
            endpoint = Constant.URL,
            config = SocketOptions(
                queryParams = null,
                transport = SocketOptions.Transport.WEBSOCKET
            )
        ) {
            on(SocketEvent.Connect) {
                Log.d(TAG, "connect")
            }
            on(SocketEvent.Disconnect) {
                Log.d(TAG, "disconnect")
            }
            on(SocketEvent.Error) {
                Log.d(TAG, "error $it")
                onFailure(it)
            }
            on(Constant.EVENT) { data ->
                onSuccess(data)
            }
        }
        socket.connect()
    }

    companion object {
        const val TAG = "MainWorker"
    }
}