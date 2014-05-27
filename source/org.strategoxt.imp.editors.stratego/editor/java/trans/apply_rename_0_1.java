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

@SuppressWarnings("all") public class apply_rename_0_1 extends Strategy 
{ 
  public static apply_rename_0_1 instance = new apply_rename_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_4741)
  { 
    context.push("apply_rename_0_1");
    Fail22850:
    { 
      IStrategoTerm j_4741 = null;
      IStrategoTerm k_4741 = null;
      IStrategoTerm l_4741 = null;
      IStrategoTerm m_4741 = null;
      m_4741 = term;
      term = i_4741;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22850;
      IStrategoTerm arg8128 = ((IStrategoList)term).head();
      if(arg8128.getTermType() != IStrategoTerm.TUPLE || arg8128.getSubtermCount() != 2)
        break Fail22850;
      j_4741 = arg8128.getSubterm(0);
      k_4741 = arg8128.getSubterm(1);
      l_4741 = ((IStrategoList)term).tail();
      term = m_4741;
      IStrategoTerm term12210 = term;
      Success12176:
      { 
        Fail22851:
        { 
          term = apply_rename_0_2.instance.invoke(context, term, j_4741, k_4741);
          if(term == null)
            break Fail22851;
          if(true)
            break Success12176;
        }
        term = this.invoke(context, term12210, l_4741);
        if(term == null)
          break Fail22850;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}