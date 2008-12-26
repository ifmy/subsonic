/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2009 (C) Sindre Mehus
 */
package net.sourceforge.subsonic.command;

import net.sourceforge.subsonic.domain.*;
import net.sourceforge.subsonic.controller.*;

import java.util.*;

/**
 * Command used in {@link SearchController}.
 *
 * @author Sindre Mehus
 */
public class SearchCommand {
    private String query;
    private boolean isTitleIncluded = true;
    private boolean isArtistAndAlbumIncluded = true;
    private String time = "0";
    private List<Match> matches;
    private boolean isIndexBeingCreated;
    private int maxHits;
    private User user;
    private boolean partyModeEnabled;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isTitleIncluded() {
        return isTitleIncluded;
    }

    public void setTitleIncluded(boolean titleIncluded) {
        isTitleIncluded = titleIncluded;
    }

    public boolean isArtistAndAlbumIncluded() {
        return isArtistAndAlbumIncluded;
    }

    public void setArtistAndAlbumIncluded(boolean artistAndAlbumIncluded) {
        isArtistAndAlbumIncluded = artistAndAlbumIncluded;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isIndexBeingCreated() {
        return isIndexBeingCreated;
    }

    public void setIndexBeingCreated(boolean indexBeingCreated) {
        isIndexBeingCreated = indexBeingCreated;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public void setMaxHits(int maxHits) {
        this.maxHits = maxHits;
    }

    public int getMaxHits() {
        return maxHits;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isPartyModeEnabled() {
        return partyModeEnabled;
    }

    public void setPartyModeEnabled(boolean partyModeEnabled) {
        this.partyModeEnabled = partyModeEnabled;
    }

    public static class Match {
        private MusicFile musicFile;
        private String title;
        private String artistAlbumYear;

        public Match(MusicFile musicFile, String title, String artistAlbumYear) {
            this.musicFile = musicFile;
            this.title = title;
            this.artistAlbumYear = artistAlbumYear;
        }

        public MusicFile getMusicFile() {
            return musicFile;
        }

        public String getTitle() {
            return title;
        }

        public String getArtistAlbumYear() {
            return artistAlbumYear;
        }
    }
}
