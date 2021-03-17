package com.dany.country_info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    val colombiaInfo = "Colombia is a country in South America. Colombia " +
            "is bounded on the north by the Caribbean Sea, the northwest by Panama, the south by " +
            "Ecuador and Peru, the east by Venezuela, the southeast by Brazil, and the west by the " +
            "Pacific Ocean. It comprises 32 departments and the Capital District of Bogotá, " +
            "the country's largest city."

    val usaInfo = "United States is a country located in North America. It consists of 50 states, a " +
            "federal district, five major self-governing territories, 326 Indian reservations, and " +
            "some minor possessions.[g] At 3.8 million square miles (9.8 million square kilometers)," +
            " it is the world's third- or fourth-largest country by total area.[c] With a population" +
            " of more than 328 million people, it is the third most populous country in the world. " +
            "The national capital is Washington, D.C., and the most populous city is New York City."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var country = intent.extras
        if (country != null) {
            if (country.get("country") == "colombia") {
                // Displaying info about Colombia:
                                                // Looking for the image in the resources:
                detailsImageId.setImageDrawable(application.getDrawable(R.drawable.colombia))
                textDetailsId.text = colombiaInfo
            } else {
                // Displaying info about Usa:
                detailsImageId.setImageDrawable(application.getDrawable(R.drawable.usa))
                textDetailsId.text = usaInfo
            }
        }


    }
}