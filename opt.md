

## doc
jar cvf mee-excel-1.0.0-javadoc.jar -C site/apidocs .

## sign
certUtil -hashfile mee-excel-1.0.0.jar md5 >> mee-excel-1.0.0.jar.md5
certUtil -hashfile mee-excel-1.0.0.jar sha1 >> mee-excel-1.0.0.jar.sha1

certUtil -hashfile mee-excel-1.0.0-sources.jar md5 >> mee-excel-1.0.0-sources.jar.md5
certUtil -hashfile mee-excel-1.0.0-sources.jar sha1 >> mee-excel-1.0.0-sources.jar.sha1

certUtil -hashfile mee-excel-1.0.0-javadoc.jar md5 >> mee-excel-1.0.0-javadoc.jar.md5
certUtil -hashfile mee-excel-1.0.0-javadoc.jar sha1 >> mee-excel-1.0.0-javadoc.jar.sha1

certUtil -hashfile mee-excel-1.0.0.pom md5 >> mee-excel-1.0.0.pom.md5
certUtil -hashfile mee-excel-1.0.0.pom sha1 >> mee-excel-1.0.0.pom.sha1

## gpg
