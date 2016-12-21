/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.wifiled.handler;

/**
 * @author Stefan Endrullis &lt;stefan@endrullis.de&gt;
 */
public class LEDState {

    public final int state, program, programSpeed;
    public final int red, green, blue, white, white2;

    public LEDState(int state, int program, int programSpeed, int red, int green, int blue, int white, int white2) {
        this.state = state;
        this.program = program;
        this.programSpeed = programSpeed;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.white = white;
        this.white2 = white2;
    }

}