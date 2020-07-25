[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)

# SpringBoot-Netflix-Nebula-gradle-RPM-plugin
Demonstration of packing your application as an RPM package using Netflix Nebula gradle RPM plugin

Netflix Nebula RPM plugin helps you to package your application as RPM or DEB files bundling your JAR and rest of the components inside it. This is very useful to create a production ready deployable component.

More Details of the plugin can be found here - https://github.com/nebula-plugins/gradle-ospackage-plugin/wiki/RPM-Plugin

Implementation of the plugin can be found in nebularpm.gradle in the source code. 

This source code bundles code as RPM that can be deployed in Ubuntu Virtual VM offered by https://www.osboxes.org/ubuntu/

User previliges used in the source code is "osboxes" and this can be tweaked as per your needs. 

Below are the useful commands to view , install and uninstall RPMs from the server

To View

sudo rpm -qlp "rpmfile"

To install 

sudo rpm -i "rpmfile"

To Uninstall 

sudo rpm -ev "Name of RPM packageinstalled"
