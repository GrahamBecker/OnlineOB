#OnlineOB

An online occurrence book.

The application allows users/security guard role to create event entries into an online occurrence book.

The entry for the user role can be viewed on the application home page where the user can login and receive a user ID which is automatically linked to the occurence.
The user can enter a maximum of 255 characters per entry.
Each entry must have a selected category from the pre-populated dropdown list. The table hosting the list is available in the database and only editable by the site administrator.

The entries are viewable on a page which loads the most recent 10 events for viewing.
A viewer/manager role can reload the page by refreshing on the refresh/get button.

Extra: the manager can indicate that he/she has read the incident by ticking the checkbox next to each entry.

The escalation procedure will be relevant to certain category selections - this is for phase 2 of the application development. The manager can provide feedback to the guard who logged the incident by entering text in the "Follow-up" textbox linked to the entry.
This is for phase 2 development.

Once the checkbox is ticked by the manager, the record moves to the archive table and is no longer viewable to the users. The site administrator can draw relevant records from the archive table.
# UML Diagram

![alt text][UML Diagram]
[UML Diagram]: https://github.com/GrahamBecker/OnlineOB/blob/master/UML.jpg "UML Diagram"
