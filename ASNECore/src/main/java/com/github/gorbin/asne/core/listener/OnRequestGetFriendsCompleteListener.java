package com.github.gorbin.asne.core.listener;

import com.github.gorbin.asne.core.listener.base.SocialNetworkListener;
import com.github.gorbin.asne.core.persons.SocialPerson;

import java.util.ArrayList;

public interface OnRequestGetFriendsCompleteListener extends SocialNetworkListener {
    public void OnGetFriendsIdComplete(int socialNetworkID, String[] friendsID);
    public void OnGetFriendsComplete(int socialNetworkID, ArrayList<SocialPerson> socialFriends);
}
