package com.nusuk.automator.core;

import android.content.Context;

import org.json.JSONObject;

import java.io.IOException;

/**
 * Versi offline: tidak ada lagi permintaan ke server.
 * Setiap pemanggilan langsung gagal seperti ketika ponsel tidak punya internet,
 * jadi kode yang memanggilnya jatuh ke jalur "gagal jaringan" yang sudah ada.
 * Tidak ada data (termasuk ID perangkat) yang dikirim keluar.
 */
public final class Http {
    private Http() {}

    public static final class Response {
        public final int status;
        public final String body;

        Response(int status, String body) {
            this.status = status;
            this.body = body;
        }
    }

    public static Response postJson(Context ctx, String path, JSONObject payload, int connectMs, int readMs) throws Exception {
        throw new IOException("offline mode");
    }
}
