/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NumberViewHolder extends RecyclerView.ViewHolder {

    TextView listItemNumberView;

    public NumberViewHolder(View itemView) {
        super(itemView);

        listItemNumberView = (TextView)itemView.findViewById(R.id.tv_item_number);
    }

    public void  bind(int listIndex)
    {
        listItemNumberView.setText(String.valueOf(listIndex));
    }



    // TODO (16) Within the NumberViewHolder class, create a void method called bind that accepts an int parameter called listIndex
    // TODO (17) Within bind, set the text of listItemNumberView to the listIndex
    // TODO (18) Be careful to get the String representation of listIndex, as using setText with an int does something different
}
