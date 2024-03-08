# SimpleCloud Displayname Module
The SimpleCloud Displayname Module is a useful extension for the cloud. With this module, administrators can configure the display name for individual servers or even entire server groups.

## Features
- Easy Configuration: Administrators can quickly and easily set the display name for their servers through the configuration file.
- Flexibility: The module supports customization of the display name for individual servers or for a group of servers.
- SimpleCloud Support: The module has been specifically designed for use with SimpleCloud and seamlessly integrates into the existing system.

## Installation
- Download the SimpleCloud Displayname Module from the [GitHub repository](https://github.com/D151l/SimpleCloud-Displayname).
- Place the downloaded module in your SimpleCloud modules directory.
- Reload or restart the cloud.

## Configuration
The configuration of the display name for servers or server groups is done through a simple JSON configuration file. Here is an example of such a configuration:

```json
// Example configuration for SimpleCloud Displayname Module

{
  "services": [
    {
      "target": "proxy-1",
      "displayname": "Proxy-Main"
    },
    {
      "target": "lobby-1",
      "displayname": "Lobby"
    }
  ],
  "groups": [
    {
      "target": "bw-8x1",
      "displayname": "BedWars"
    }
  ]
}
```
In this configuration, the display names for two individual servers (proxy-1 and lobby-1) as well as for a server group (bw-8x1) are set.

## Usage
Once the module is installed and configured, the set display names will be automatically shown on the respective servers.

## Support
If you have any questions, issues, or feature requests, feel free to create an issue in this repository.
