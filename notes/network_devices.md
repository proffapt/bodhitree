# Network Devices

### Amplifier 

- Not used in networking tho, used in audio signal processing mostly.
- Stupid device, just increases the power of whatever it gets.
- Main signal, attenuation, noice etc are amplified altogether.

### Repeater

- DOESN'T AMPLIFY THE SIGNAL!
- Breaks the signal -> Fix noise, disturbance, attenuation etc -> Regenerate it -> Re-transmit it.
- 2 port device.
- Layer 1 (just playing with electrical signals) - no brains

### Hub

- Multiport Repeater.
- Just echoes to every device, stupid enough to not to be able to decide where to send>
- Layer 1 (just playing with electrical signals) - no brains

### WAP

- Wireless HUB :)
- It's dumb and sends message to everyone coz that's how Wireless tech is currently.
- Layer 1 & Layer 2 (just playing with waves :shrug) - no brains

### Bridge

- Repeater wtih ability to filter MAC addresses (intelligence which Hub lacked)
- Connects 2 LANs working on same protocol.
- 2 port device.
- Layer 2

### Switch

- Multiport Bridge + buffer + design to improve efficiency.
- Layer 2

#### Amplifier->Repeater ,Repeater->Hub + Repeater->Bridge + some other intelligence= Switch)

### Router / Gateway

- Connects LANs to WANs.
- Switch - MAC address filtering + IP address filtering +- some other shits = Router.
- Why Gateway?
    - Gateway to another network.
    - Basically this is the thing which enables us to connect to different network.
- Layer 3

### Gateway

- Connects 2 DIFFERENT networks.
- Also, known as PROTOCOL CONVERTORS.
- Layer 3

### Brouter

- Also known as __Bridging Router__.
- Capabilites of Router and a Bridge.
- Layer 2 + Layer 3
