import string, random

msg = input("Enter the message: ")

def encode(msg):
    if len(msg) >= 3:
        enc_msg = msg[1:]+msg[0]
        for i in range(3):
            enc_msg += random.choice(string.ascii_letters + string.digits)
            enc_msg = random.choice(string.ascii_letters + string.digits) + enc_msg
    else:
        enc_msg = msg[::-1]
    return enc_msg

def decode(msg):
    if len(msg) <= 3:
        dec_msg = msg[::-1]
    else:
        dec_msg = msg[3:-4]
        dec_msg = msg[-4]+dec_msg
    return dec_msg

print(encode(msg))
print(decode(encode(msg)))
