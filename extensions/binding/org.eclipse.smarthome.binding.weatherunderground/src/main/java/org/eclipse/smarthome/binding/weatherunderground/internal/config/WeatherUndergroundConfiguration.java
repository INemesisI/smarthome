/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.binding.weatherunderground.internal.config;

/**
 * The {@link WeatherUndergroundConfiguration} is the class used to match the
 * thing configuration.
 *
 * @author Laurent Garnier - Initial contribution
 */
public class WeatherUndergroundConfiguration {

    public static final String LOCATION = "location";

    public String location;
    public String language;
    public Integer refresh;

}
