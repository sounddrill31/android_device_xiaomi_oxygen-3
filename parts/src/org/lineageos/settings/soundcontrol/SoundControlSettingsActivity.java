/*
 * Copyright (C) 2018 The Asus-SDM660 Project
 * Copyright (C) 2017-2021 The LineageOS Project
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
 * limitations under the License
 */

package org.lineageos.settings.soundcontrol;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;


public class SoundControlSettingsActivity extends CollapsingToolbarBaseActivity {

    private SoundControlSettings mSoundControlSettingsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fragment fragment = getFragmentManager().findFragmentById(android.R.id.content);
        if (fragment == null) {
            mSoundControlSettingsFragment = new SoundControlSettings();
            getFragmentManager().beginTransaction()
                    .add(com.android.settingslib.collapsingtoolbar.R.id.content_frame, mSoundControlSettingsFragment)
                    .commit();
        } else {
            mSoundControlSettingsFragment = (SoundControlSettings) fragment;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
