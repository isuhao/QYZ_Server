
package xbean.__;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

public final class StoryNoteChapter extends xdb.XBean implements xbean.StoryNoteChapter {
	private xdb.util.SetX<Integer> notes; // 

	@Override
	public void _reset_unsafe_() {
		notes.clear();
	}

	StoryNoteChapter(int __, xdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		notes = new xdb.util.SetX<Integer>();
	}

	public StoryNoteChapter() {
		this(0, null, null);
	}

	public StoryNoteChapter(StoryNoteChapter _o_) {
		this(_o_, null, null);
	}

	StoryNoteChapter(xbean.StoryNoteChapter _o1_, xdb.XBean _xp_, String _vn_) {
		super(_xp_, _vn_);
		if (_o1_ instanceof StoryNoteChapter) assign((StoryNoteChapter)_o1_);
		else if (_o1_ instanceof StoryNoteChapter.Data) assign((StoryNoteChapter.Data)_o1_);
		else if (_o1_ instanceof StoryNoteChapter.Const) assign(((StoryNoteChapter.Const)_o1_).nThis());
		else throw new UnsupportedOperationException();
	}

	private void assign(StoryNoteChapter _o_) {
		_o_._xdb_verify_unsafe_();
		notes = new xdb.util.SetX<Integer>();
		notes.addAll(_o_.notes);
	}

	private void assign(StoryNoteChapter.Data _o_) {
		notes = new xdb.util.SetX<Integer>();
		notes.addAll(_o_.notes);
	}

    	@Override
    	public final OctetsStream marshal(OctetsStream _os_) {
    		_xdb_verify_unsafe_();
    		_os_.marshal((short)1);
    _os_.marshal((short)(20480|  1));{final OctetsStream _temp_ = _os_; _os_ = new OctetsStream();
_os_.compact_uint32(notes.size());
for (Integer _v_ : notes) {
	_os_.marshal(_v_);
}
_temp_.marshal(_os_); _os_ = _temp_;}
    		return _os_;
    	}

    	@Override
    	public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
    		_xdb_verify_unsafe_();
    		for(int  _var_num_ = _os_.unmarshal_short() ; _var_num_-- > 0 ; ) {
    			final short _id_ = _os_.unmarshal_short();
    			switch(_id_) {
    				case (20480|  1):{final OctetsStream _temp_ = _os_; _os_ = OctetsStream.wrap(_temp_.unmarshal_Octets());
for (int size = _os_.uncompact_uint32(); size > 0; --size) {
	int _v_ = 0;
	_v_ = _os_.unmarshal_int();
	notes.add(_v_);
}
_os_ = _temp_;}
    				break;
    default:skipUnknownField(_id_, _os_);
    			}
    		}
    		return _os_;
    	}

	@Override
	public xbean.StoryNoteChapter copy() {
		_xdb_verify_unsafe_();
		return new StoryNoteChapter(this);
	}

	@Override
	public xbean.StoryNoteChapter toData() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.StoryNoteChapter toBean() {
		_xdb_verify_unsafe_();
		return new StoryNoteChapter(this); // same as copy()
	}

	@Override
	public xbean.StoryNoteChapter toDataIf() {
		_xdb_verify_unsafe_();
		return new Data(this);
	}

	public xbean.StoryNoteChapter toBeanIf() {
		_xdb_verify_unsafe_();
		return this;
	}

	@Override
	public xdb.Bean toConst() {
		_xdb_verify_unsafe_();
		return new Const();
	}

	@Override
	public java.util.Set<Integer> getNotes() { // 
		_xdb_verify_unsafe_();
		return xdb.Logs.logSet(new xdb.LogKey(this, "notes"), notes);
	}

	public java.util.Set<Integer> getNotesAsData() { // 
		_xdb_verify_unsafe_();
		java.util.Set<Integer> notes;
		StoryNoteChapter _o_ = this;
		notes = new xdb.util.SetX<Integer>();
		notes.addAll(_o_.notes);
		return notes;
	}

	@Override
	public final boolean equals(Object _o1_) {
		_xdb_verify_unsafe_();
		StoryNoteChapter _o_ = null;
		if ( _o1_ instanceof StoryNoteChapter ) _o_ = (StoryNoteChapter)_o1_;
		else if ( _o1_ instanceof StoryNoteChapter.Const ) _o_ = ((StoryNoteChapter.Const)_o1_).nThis();
		else return false;
		if (!notes.equals(_o_.notes)) return false;
		return true;
	}

	@Override
	public final int hashCode() {
		_xdb_verify_unsafe_();
		int _h_ = 0;
		_h_ += notes.hashCode();
		return _h_;
	}

	@Override
	public String toString() {
		_xdb_verify_unsafe_();
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(notes);
		_sb_.append(")");
		return _sb_.toString();
	}

	@Override
	public xdb.logs.Listenable newListenable() {
		xdb.logs.ListenableBean lb = new xdb.logs.ListenableBean();
		lb.add(new xdb.logs.ListenableSet().setVarName("notes"));
		return lb;
	}

	private class Const implements xbean.StoryNoteChapter {
		StoryNoteChapter nThis() {
			return StoryNoteChapter.this;
		}

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		@Override
		public xbean.StoryNoteChapter copy() {
			return StoryNoteChapter.this.copy();
		}

		@Override
		public xbean.StoryNoteChapter toData() {
			return StoryNoteChapter.this.toData();
		}

		public xbean.StoryNoteChapter toBean() {
			return StoryNoteChapter.this.toBean();
		}

		@Override
		public xbean.StoryNoteChapter toDataIf() {
			return StoryNoteChapter.this.toDataIf();
		}

		public xbean.StoryNoteChapter toBeanIf() {
			return StoryNoteChapter.this.toBeanIf();
		}

		@Override
		public java.util.Set<Integer> getNotes() { // 
			_xdb_verify_unsafe_();
			return xdb.Consts.constSet(notes);
		}

		public java.util.Set<Integer> getNotesAsData() { // 
			_xdb_verify_unsafe_();
			java.util.Set<Integer> notes;
			StoryNoteChapter _o_ = StoryNoteChapter.this;
		notes = new xdb.util.SetX<Integer>();
		notes.addAll(_o_.notes);
			return notes;
		}

		@Override
		public xdb.Bean toConst() {
			_xdb_verify_unsafe_();
			return this;
		}

		@Override
		public boolean isConst() {
			_xdb_verify_unsafe_();
			return true;
		}

		@Override
		public boolean isData() {
			return StoryNoteChapter.this.isData();
		}

		@Override
		public OctetsStream marshal(OctetsStream _os_) {
			return StoryNoteChapter.this.marshal(_os_);
		}

		@Override
		public OctetsStream unmarshal(OctetsStream arg0) throws MarshalException {
			_xdb_verify_unsafe_();
			throw new UnsupportedOperationException();
		}

		@Override
		public xdb.Bean xdbParent() {
			return StoryNoteChapter.this.xdbParent();
		}

		@Override
		public boolean xdbManaged() {
			return StoryNoteChapter.this.xdbManaged();
		}

		@Override
		public String xdbVarname() {
			return StoryNoteChapter.this.xdbVarname();
		}

		@Override
		public Long xdbObjId() {
			return StoryNoteChapter.this.xdbObjId();
		}

		@Override
		public boolean equals(Object obj) {
			return StoryNoteChapter.this.equals(obj);
		}

		@Override
		public int hashCode() {
			return StoryNoteChapter.this.hashCode();
		}

		@Override
		public String toString() {
			return StoryNoteChapter.this.toString();
		}

	}

	public static final class Data implements xbean.StoryNoteChapter {
		private java.util.HashSet<Integer> notes; // 

		@Override
		public void _reset_unsafe_() {
			throw new UnsupportedOperationException();
		}

		public Data() {
			notes = new java.util.HashSet<Integer>();
		}

		Data(xbean.StoryNoteChapter _o1_) {
			if (_o1_ instanceof StoryNoteChapter) assign((StoryNoteChapter)_o1_);
			else if (_o1_ instanceof StoryNoteChapter.Data) assign((StoryNoteChapter.Data)_o1_);
			else if (_o1_ instanceof StoryNoteChapter.Const) assign(((StoryNoteChapter.Const)_o1_).nThis());
			else throw new UnsupportedOperationException();
		}

		private void assign(StoryNoteChapter _o_) {
			notes = new java.util.HashSet<Integer>();
			notes.addAll(_o_.notes);
		}

		private void assign(StoryNoteChapter.Data _o_) {
			notes = new java.util.HashSet<Integer>();
			notes.addAll(_o_.notes);
		}

		@Override
		public final OctetsStream marshal(OctetsStream _os_) {
			_os_.marshal((short)1);
	_os_.marshal((short)(20480|  1));{final OctetsStream _temp_ = _os_; _os_ = new OctetsStream();
_os_.compact_uint32(notes.size());
for (Integer _v_ : notes) {
	_os_.marshal(_v_);
}
_temp_.marshal(_os_); _os_ = _temp_;}
			return _os_;
		}

		@Override
		public final OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
			for(int  _var_num_ = _os_.unmarshal_short() ; _var_num_-- > 0 ; ) {
				final short _id_ = _os_.unmarshal_short();
				switch(_id_) {
					case (20480|  1):{final OctetsStream _temp_ = _os_; _os_ = OctetsStream.wrap(_temp_.unmarshal_Octets());
for (int size = _os_.uncompact_uint32(); size > 0; --size) {
	int _v_ = 0;
	_v_ = _os_.unmarshal_int();
	notes.add(_v_);
}
_os_ = _temp_;}
					break;
	default:skipUnknownField(_id_, _os_);
				}
			}
			return _os_;
		}

		@Override
		public xbean.StoryNoteChapter copy() {
			return new Data(this);
		}

		@Override
		public xbean.StoryNoteChapter toData() {
			return new Data(this);
		}

		public xbean.StoryNoteChapter toBean() {
			return new StoryNoteChapter(this, null, null);
		}

		@Override
		public xbean.StoryNoteChapter toDataIf() {
			return this;
		}

		public xbean.StoryNoteChapter toBeanIf() {
			return new StoryNoteChapter(this, null, null);
		}

		// xdb.Bean interface. Data Unsupported
		public boolean xdbManaged() { throw new UnsupportedOperationException(); }
		public xdb.Bean xdbParent() { throw new UnsupportedOperationException(); }
		public String xdbVarname()  { throw new UnsupportedOperationException(); }
		public Long    xdbObjId()   { throw new UnsupportedOperationException(); }
		public xdb.Bean toConst()   { throw new UnsupportedOperationException(); }
		public boolean isConst()    { return false; }
		public boolean isData()     { return true; }

		@Override
		public java.util.Set<Integer> getNotes() { // 
			return notes;
		}

		@Override
		public java.util.Set<Integer> getNotesAsData() { // 
			return notes;
		}

		@Override
		public final boolean equals(Object _o1_) {
			if (!(_o1_ instanceof StoryNoteChapter.Data)) return false;
			StoryNoteChapter.Data _o_ = (StoryNoteChapter.Data) _o1_;
			if (!notes.equals(_o_.notes)) return false;
			return true;
		}

		@Override
		public final int hashCode() {
			int _h_ = 0;
			_h_ += notes.hashCode();
			return _h_;
		}

		@Override
		public String toString() {
			StringBuilder _sb_ = new StringBuilder();
			_sb_.append("(");
			_sb_.append(notes);
			_sb_.append(")");
			return _sb_.toString();
		}

	}
}
