/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.tado.internal.config;

/**
 * Holder-object for zone configuration
 *
 * @author Dennis Frommknecht - Initial contribution
 */
public class TadoZoneConfig {
    public long id;
    public int refreshInterval;
    public int fallbackTimerDuration;
    public int hvacChangeDebounce;
}
