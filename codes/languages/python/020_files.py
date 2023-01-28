# Reading a file

fr = open('_myfile.txt', 'r')
#                        ^ read[r] / over-write[w] / append[a] / create[x]
#                        ^^ text[t] / binary[b]
'''
    - Read mode is the default value of the second argument
    - Write & Append mode create the file if it doesn't exist

    - text mode is the default mode of accessing files
        * 'r' & 'rt' means the same. Similarly for all others.
    - binary mode is used for files types like - images, pdfs, exe etc
'''
print(fr.read())
fr.close() # It's always important to close the file stream

def read_file(): # Using this for simplicity
    with open('_myfile.txt') as f:
        print(f.read())

# Writing to a file
fw = open('_myfile.txt', 'w')
fw.write("Hello, World! of writing to a file in python")
fw.close() # It's always important to close the file stream
read_file()

# Appending to a file
fa = open('_myfile.txt', 'a')
fa.write("\nHello, World!")
fa.close() # It's always important to close the file stream
read_file()

## A better syntax which closes the filestream by default
with open('_myfile.txt', 'a') as f:
    f.write("\nManipulating files using with statement")
read_file()

# Reading line by line
with open('_myfile.txt', 'r') as f:
    while True:
        line = f.readline()
        print(line)
        if not line:
            break

# Writing from a iterable object one by one
with open('_myfile.txt', 'a') as f:
    line = ['\na', '\nb', '\nc'] # f.writelines() won't add a newline by itself, you have to do it
    f.writelines(line)
read_file()

# MISCELLENEOUS
with open('_myfile.txt', 'r') as f:
    print(f.read(4))# Reads next 4 bytes from the current position - including the current byte as well
    f.seek(10) # Moves the file pointter by 10 bytes
    print(f'We are at {f.tell()}\'th byte of the file')
    # f.tell() -> Helps us to know our location
    print(f.read(4))
with open('_myfile.txt', 'w') as f:
    # f.truncate(5) truncates the content to specified size
    f.truncate(5)
read_file()
