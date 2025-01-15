#!/bin/sh

echo on > /sys/class/drm/card1-HDMI-A-1/status
sleep 1
systemctl restart weston
echo "weston restart" > /root/venom_weston_restart
