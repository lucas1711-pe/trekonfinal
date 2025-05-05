
package com.trekon.app;

import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView statusTextView;
    private NfcAdapter nfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        statusTextView = new TextView(this);
        setContentView(statusTextView);

        nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        if (nfcAdapter != null && nfcAdapter.isEnabled()) {
            statusTextView.setText("NFC ativado. Aguardando leitura...");
        } else {
            statusTextView.setText("NFC não disponível ou desativado.");
        }
    }
}
