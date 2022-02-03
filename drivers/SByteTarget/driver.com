driverid
1

# here we define the driver type
# following names are valid 
# omron, siemens, beckhoff, mitsubishi, ..
# cpu types and additional type specific configuration should
# we insert into the next section
drivertype
calculation

# here we define the version of the configured driver
driverversion
1.0.1

# namespace name for that driver
drvns
http://bichler.tech/calculation

# here we can add additional driver properties
# specifies if the driver directly creates the opc ua address space model
drvproperties
model_from_drv=false

# here we can define all driver specific properties
connection properties

# here we can add complex data point types
complexTypes
DB; FB; FC; SFC

#
redundancy no

# interval to scan the siemens device
scancyclic
true;1000
