This is created after running the following command:
`python3 -m venv 016_venv`

What did it do?
- It copied the current configuration of python(ONLY python by default, just like a fresh install - no other manually installed packages) from my system.

How to activate this environmen?
`source 016_venv/bin/activate.fish` // Note that `.fish` is used because I am using fish shell, otherwise activate would have worked

How to deactivate?
`deactivate`

---------------------------------
This part is not specific to venv
---------------------------------

How to install a specific version of a package?
`pip3 install pandas==1.4.4`

How to get all the packages installed on this particular venv?
`pip3 freeze > requirements.txt`

How will the user use this txt file?
`pip3 install -r requirements.txt`
