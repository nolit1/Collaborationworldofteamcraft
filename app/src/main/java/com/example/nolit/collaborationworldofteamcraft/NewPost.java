package com.example.nolit.collaborationworldofteamcraft;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This app displays an order form to order coffee.
 */
public class NewPost extends AppCompatActivity {

    int quantity = 2;

    ArrayList<String> phones = new ArrayList();
    ArrayAdapter<String> adapter;

    ArrayList<String> selectedPhones = new ArrayList();
    ListView phonesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_post);

//        phones.add("Руководитель проекта");
//        phones.add("WEB-дизайнер");
//        phones.add("WEB-программист");
//        phones.add("Спонсор");
//
//        phonesList = (ListView) findViewById(R.id.phonesList);
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, phones);
//        phonesList.setAdapter(adapter);
//
//        // обработка установки и снятия отметки в списке
//        phonesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
//            {
//                // получаем нажатый элемент
//                String phone = adapter.getItem(position);
//                if(phonesList.isItemChecked(position)){
//                    selectedPhones.add(phone);
//                }
//                else{
//
//                    selectedPhones.remove(phone);
//                }
//            }
//        });
    }

//    public void add(View view){
//
//        EditText phoneEditText = (EditText) findViewById(R.id.phone);
//        String phone = phoneEditText.getText().toString();
//        if(!phone.isEmpty() && phones.contains(phone)==false){
//            adapter.add(phone);
//            phoneEditText.setText("");
//            adapter.notifyDataSetChanged();
//        }
//    }
//    public void remove(View view){
//        // получаем и удаляем выделенные элементы
//        for(int i=0; i< selectedPhones.size();i++){
//            adapter.remove(selectedPhones.get(i));
//        }
//        // снимаем все ранее установленные отметки
//        phonesList.clearChoices();
//        // очищаем массив выбраных объектов
//        selectedPhones.clear();
//
//        adapter.notifyDataSetChanged();
//    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }


    private String getName() {
        EditText nameField = findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        return nameEditable.toString();
    }

    private String getDescription() {
        EditText nameField = findViewById(R.id.description);
        Editable nameEditable = nameField.getText();
        return nameEditable.toString();
    }

    private String getQuantity() {

      return getString(R.string.order_summary_quantity);
    }

    /**
     * This method is called when the order button is clicked.
     *
     * Чисто бесполезная функция, которая выводит подсказку
     */
    @SuppressLint("StringFormatInvalid")
    public void submitOrder(View view) {

        // Figure out if the user wants whipped cream topping
//        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
//        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        // Display the order summary on the screen
        String message = getName() + "\n" + getDescription();
        Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();//, price, hasWhippedCream, hasChocolate);
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT, "Отправлено из приложения " +
//                "Collaboration – world of team craft" + "\n" + "\n" + message + ":" + "\n" + "\n" +
//                "Количество людей в заявке:" + "\n" + "\n" + getQuantity() );
//
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
        Intent intent = new Intent(NewPost.this, AfterCreatePost.class);
        startActivity(intent);
    }


    /**
     * Create summary of the order.
     *
    // * @param name            on the order is whether or not to add chocolate to the coffee
     * @return text summary
     */
    private String createOrderSummary(String name) {

        EditText nameField = (EditText) findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name1 = nameEditable.toString();

//        priceMessage += "\n" + getString(R.string.order_summary_whipped_cream, addWhippedCream);
//        priceMessage += "\n" + getString(R.string.order_summary_chocolate, addChocolate);
//        priceMessage += "\n" + getString(R.string.order_summary_quantity, quantity);
//        priceMessage += "\n" + getString(R.string.order_summary_price,
//                NumberFormat.getCurrencyInstance().format(price));
//        priceMessage += "\n" + getString(R.string.thank_you);
        return name1;
//        return "hello";
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }
}
