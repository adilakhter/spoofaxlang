package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21523 extends Strategy 
{ 
  TermReference c_92030;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76500:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consterm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76500;
      IStrategoTerm arg25921 = term.getSubterm(0);
      if(arg25921.getTermType() != IStrategoTerm.APPL || Main._consdefault_1 != ((IStrategoAppl)arg25921).getConstructor())
        break Fail76500;
      IStrategoTerm arg25922 = arg25921.getSubterm(0);
      if(arg25922.getTermType() != IStrategoTerm.APPL || Main._consappl_2 != ((IStrategoAppl)arg25922).getConstructor())
        break Fail76500;
      IStrategoTerm arg25923 = arg25922.getSubterm(0);
      if(arg25923.getTermType() != IStrategoTerm.APPL || Main._consunquoted_1 != ((IStrategoAppl)arg25923).getConstructor())
        break Fail76500;
      IStrategoTerm arg25924 = arg25923.getSubterm(0);
      if(arg25924.getTermType() != IStrategoTerm.STRING || !"cons".equals(((IStrategoString)arg25924).stringValue()))
        break Fail76500;
      IStrategoTerm arg25925 = arg25922.getSubterm(1);
      if(arg25925.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg25925).isEmpty())
        break Fail76500;
      IStrategoTerm arg25926 = ((IStrategoList)arg25925).head();
      if(arg25926.getTermType() != IStrategoTerm.APPL || Main._consfun_1 != ((IStrategoAppl)arg25926).getConstructor())
        break Fail76500;
      IStrategoTerm arg25927 = arg25926.getSubterm(0);
      if(arg25927.getTermType() != IStrategoTerm.APPL || Main._consquoted_1 != ((IStrategoAppl)arg25927).getConstructor())
        break Fail76500;
      if(c_92030.value == null)
        c_92030.value = arg25927.getSubterm(0);
      else
        if(c_92030.value != arg25927.getSubterm(0) && !c_92030.value.match(arg25927.getSubterm(0)))
          break Fail76500;
      IStrategoTerm arg25928 = ((IStrategoList)arg25925).tail();
      if(arg25928.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg25928).isEmpty())
        break Fail76500;
      if(true)
        return term;
    }
    return null;
  }
}