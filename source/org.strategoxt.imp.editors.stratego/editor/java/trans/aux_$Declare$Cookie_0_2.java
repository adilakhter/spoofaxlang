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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_4345, IStrategoTerm n_4345)
  { 
    Fail22181:
    { 
      IStrategoTerm term12087 = term;
      Success11957:
      { 
        Fail22182:
        { 
          IStrategoTerm f_4323 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22182;
          IStrategoTerm arg7967 = term.getSubterm(0);
          if(arg7967.getTermType() != IStrategoTerm.STRING || !"-783129".equals(((IStrategoString)arg7967).stringValue()))
            break Fail22182;
          f_4323 = term.getSubterm(1);
          term = f_4323;
          if(true)
            break Success11957;
        }
        term = term12087;
        IStrategoTerm b_4323 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22181;
        IStrategoTerm arg7968 = term.getSubterm(0);
        if(arg7968.getTermType() != IStrategoTerm.STRING || !"-670577".equals(((IStrategoString)arg7968).stringValue()))
          break Fail22181;
        b_4323 = term.getSubterm(1);
        term = b_4323;
      }
      if(true)
        return term;
    }
    context.push("aux_DeclareCookie_0_2");
    context.popOnFailure();
    return null;
  }
}