
package lx.gs.family.msg;

import lx.gs.family.PGetFamilyLog;

import com.goldhuman.Common.Marshal.MarshalException;
import com.goldhuman.Common.Marshal.OctetsStream;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CGetFamilyLog__ extends xio.Protocol { }

/** 获取家族日志
*/
// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CGetFamilyLog extends __CGetFamilyLog__ {
	@Override
	protected void process() {
		new PGetFamilyLog(this).validateRoleidAndExecute();
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6570992;

	public int getType() {
		return 6570992;
	}

	public long familyid;

	public CGetFamilyLog() {
	}

	public CGetFamilyLog(long _familyid_) {
		this.familyid = _familyid_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(familyid);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		familyid = _os_.unmarshal_long();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CGetFamilyLog) {
			CGetFamilyLog _o_ = (CGetFamilyLog)_o1_;
			if (familyid != _o_.familyid) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += (int)familyid;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(familyid).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CGetFamilyLog _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = Long.signum(familyid - _o_.familyid);
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

