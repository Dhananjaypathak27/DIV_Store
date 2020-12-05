package in.xparticle.divstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AdminAddNewProductActivity extends AppCompatActivity {

    private Button AddNewProductButton;
    private String CategoryName;
    private ImageView InputProductImage;
    private EditText InputProductName,InputProductDescription,InputProductPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_product);

        CategoryName = getIntent().getStringExtra("category");
        Toast.makeText(this, ""+ CategoryName, Toast.LENGTH_SHORT).show();

        AddNewProductButton = findViewById(R.id.add_new_product);
        InputProductImage = findViewById(R.id.select_product_image);
        InputProductName = findViewById(R.id.product_name);
        InputProductDescription = findViewById(R.id.product_description);
        InputProductPrice = findViewById(R.id.product_price);
    }
}