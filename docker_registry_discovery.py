
f = open('config.yml', 'r')

registryUri = "911479539546.dkr.ecr.us-east-1.amazonaws.com" #hard coded for now

conf = {}
for line in f.readlines():
    splited = line.split(':')
    conf[splited[0]] = splited[1].strip()

print registryUri + "/" + conf['name'] + "/" + conf['version']