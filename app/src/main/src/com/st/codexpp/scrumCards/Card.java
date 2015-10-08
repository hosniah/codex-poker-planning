package com.st.codexpp.scrumCards;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class Card {
    public static final int[] IDS = new int[] {
        R.id.card0,
        R.id.card1_2,
        R.id.card1,
        R.id.card2,
        R.id.card3,
        R.id.card5,
        R.id.card8,
        R.id.card13,
        R.id.card20,
        R.id.card40,
        R.id.card100,
        R.id.cardq
    };

    



    public static final int[] IMAGESDIGITS = new int[] {
        R.drawable.card_big_0,
        R.drawable.card_big_1_2,
        R.drawable.card_big_1,
        R.drawable.card_big_2,
        R.drawable.card_big_3,
        R.drawable.card_big_5,
        R.drawable.card_big_8,
        R.drawable.card_big_13,
        R.drawable.card_big_20,
        R.drawable.card_big_40,
        R.drawable.card_big_100,
        R.drawable.card_big_question
    };

    // Using some fancy cards in here
    public static final int[] IMAGES = new int[] {
        R.drawable.planning_poker_coffee_break,
        R.drawable.planning_poker_eat_a_brownie,
        R.drawable.planning_poker_low_hanging_fruit_1,
        R.drawable.planning_poker_cake_2,
        R.drawable.planning_poker_it_aint_rocket_science_3,
        R.drawable.planning_poker_05,
        R.drawable.planning_poker_an_arm_and_a_leg_8,
        R.drawable.planning_poker_squeaking_by_13,
        R.drawable.planning_poker_sont_put_all_20,
        R.drawable.planning_poker_meterse_en_un_berenjenal_40,
        R.drawable.planning_poker_monster_task_100,
        R.drawable.planning_poker_here_be_dragons
    };

    public static ImageView createCardView(Context context, ViewGroup parent, int position) {
        final String PREFERENCE_FANCY_CARDS = "use_fancy_cards";
        boolean fancyCards = false;
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        fancyCards = sharedPreferences.getBoolean(PREFERENCE_FANCY_CARDS, false);
        

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ImageView imageView = (ImageView) inflater.inflate(R.layout.card, parent, false);

        if (fancyCards) {
        	imageView.setImageResource(Card.IMAGES[position]);
        } else {
        	imageView.setImageResource(Card.IMAGESDIGITS[position]);
        }

//        Resources resources = context.getResources();
//        imageView.setImageBitmap(BitmapFactory.decodeResource(resources, Card.IMAGES[position]));

        return imageView;
    }
}
