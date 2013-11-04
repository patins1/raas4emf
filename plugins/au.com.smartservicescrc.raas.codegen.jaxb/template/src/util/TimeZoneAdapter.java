package MyPackage;

import java.util.TimeZone;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Since unmarshalling a timezone would not work as {@link TimeZone} is an
 * abstract class, this adapter should be used for {@link TimeZone} typed
 * values.
 */
 public class TimeZoneAdapter extends XmlAdapter<TimeZoneID, TimeZone> {

	@Override
	public TimeZone unmarshal(TimeZoneID v) throws Exception {
		return TimeZone.getTimeZone(v.getID());
	}

	@Override
	public TimeZoneID marshal(TimeZone v) throws Exception {
		if (v == null)
			return null;
		TimeZoneID result = new TimeZoneID();
		result.setID(v.getID());
		return result;
	}
}
