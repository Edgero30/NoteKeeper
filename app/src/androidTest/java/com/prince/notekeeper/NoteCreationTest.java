package com.prince.notekeeper;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.prince.notekeeper.view.NoteListActivity;

@RunWith(AndroidJUnit4.class)
public class NoteCreationTest {
    @Rule
    public ActivityScenarioRule<NoteListActivity> mNoteListActivityRule =
            new ActivityScenarioRule<>(NoteListActivity.class);

    @Test
    public void createNewNote() {

    }
}