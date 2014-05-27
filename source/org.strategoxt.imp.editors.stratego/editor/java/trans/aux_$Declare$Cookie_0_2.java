package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$Declare$Cookie_0_2 extends Strategy 
{ 
  public static aux_$Declare$Cookie_0_2 instance = new aux_$Declare$Cookie_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4899, IStrategoTerm f_4899)
  { 
    Fail23657:
    { 
      IStrategoTerm term12796 = term;
      Success12666:
      { 
        Fail23658:
        { 
          IStrategoTerm x_4876 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail23658;
          IStrategoTerm arg8434 = term.getSubterm(0);
          if(arg8434.getTermType() != IStrategoTerm.STRING || !"-783129".equals(((IStrategoString)arg8434).stringValue()))
            break Fail23658;
          x_4876 = term.getSubterm(1);
          term = x_4876;
          if(true)
            break Success12666;
        }
        term = term12796;
        IStrategoTerm t_4876 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail23657;
        IStrategoTerm arg8435 = term.getSubterm(0);
        if(arg8435.getTermType() != IStrategoTerm.STRING || !"-670577".equals(((IStrategoString)arg8435).stringValue()))
          break Fail23657;
        t_4876 = term.getSubterm(1);
        term = t_4876;
      }
      if(true)
        return term;
    }
    context.push("aux_DeclareCookie_0_2");
    context.popOnFailure();
    return null;
  }
}