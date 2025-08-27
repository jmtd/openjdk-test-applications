# Test for OPENJDK-4024

<https://issues.redhat.com/browse/OPENJDK-4024>

This is a minimal Maven project which depends upon a particular profile
being activated (via the enforcer plugin).

It ships a Maven `settings.xml` at the path `configuration/settings.xml`.
The builder should automatically pick this up.
