/*
 * MIT License
 *
 * Copyright (c) 2018, Apptastic Software
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.apptastic.rssreader;

import java.util.Optional;

/**
 * Class representing a RSS item enclosure. The <enclosure> element allows a media-file to be included with an item.
 */
public class Enclosure {
    private Integer length;
    private String type;
    private String url;

    /**
     * Get the length (in bytes) of the media file.
     *
     * @return length
     */
    public Optional<Integer> getLength() {
        return Optional.ofNullable(length);
    }

    /**
     * Set the length (in bytes) of the media file.
     *
     * @param length length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Get the type of media file.
     *
     * @return length
     */
    public Optional<String> getType() {
        return Optional.ofNullable(type);
    }

    /**
     * Set the type of media file.
     *
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the URL to the media file.
     *
     * @return length
     */
    public Optional<String> getUrl() {
        return Optional.ofNullable(url);
    }

    /**
     * Set the URL to the media file.
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
