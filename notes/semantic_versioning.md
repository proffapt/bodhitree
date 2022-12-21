Given a version number MAJOR.MINOR.PATCH, increment the:

- MAJOR version when you make incompatible API changes
- MINOR version when you add functionality in a backwards compatible manner
- PATCH version when you make backwards compatible bug fixes


```graphql
	1.0.1
	^ ^ ^
	| |	|
	| | ---- Patch Release (Backwards compaitible) - Has bug fixes
	| ------ Minor Release (Backwards Compaitible) - New Features
	-------- Changes that break backwards compaitibility
```

> **Note** Refer https://semver.org/

