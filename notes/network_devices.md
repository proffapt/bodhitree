# Network Devices

### Amplifier 

- Not used in networking tho, used in audio signal processing mostly.
- Stupid device, just increases the power of whatever it gets.
- Main signal, attenuation, noice etc are amplified altogether.

### Repeater

- DOESN'T AMPLIFY THE SIGNAL!
- Breaks the signal -> Fix noise, disturbance, attenuation etc -> Regenerate it -> Re-transmit it.
- 2 port device.

### Hub

- Multiport Repeater.
- Just echoes to every device, stupid enough to not to be able to decide where to send>

### WAP

- Wireless HUB :)
- It's dumb and sends message to everyone coz that's how Wireless tech is currently.

### Bridge

- Repeater wtih ability to filter MAC addresses (intelligence which Hub lacked)
- Connects 2 LANs working on same protocol.
- 2 port device.

### Switch

- Multiport Bridge + buffer + design to improve efficiency.

#### Amplifier->Repeater ,Repeater->Hub + Repeater->Bridge + some other intelligence= Switch)

### Router

- Connects LANs to WANs.
- Switch - MAC address filtering + IP address filtering +- some other shits = Router.

### Gateway

- Connects 2 DIFFERENT networks.
- Also, known as PROTOCOL CONVERTORS.

### Brouter

- Also known as __Bridging Router__.
- Capabilites of Router and a Bridge.
