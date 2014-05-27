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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_4187)
  { 
    context.push("apply_rename_0_1");
    Fail21374:
    { 
      IStrategoTerm r_4187 = null;
      IStrategoTerm s_4187 = null;
      IStrategoTerm t_4187 = null;
      IStrategoTerm u_4187 = null;
      u_4187 = term;
      term = q_4187;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail21374;
      IStrategoTerm arg7661 = ((IStrategoList)term).head();
      if(arg7661.getTermType() != IStrategoTerm.TUPLE || arg7661.getSubtermCount() != 2)
        break Fail21374;
      r_4187 = arg7661.getSubterm(0);
      s_4187 = arg7661.getSubterm(1);
      t_4187 = ((IStrategoList)term).tail();
      term = u_4187;
      IStrategoTerm term11501 = term;
      Success11467:
      { 
        Fail21375:
        { 
          term = apply_rename_0_2.instance.invoke(context, term, r_4187, s_4187);
          if(term == null)
            break Fail21375;
          if(true)
            break Success11467;
        }
        term = this.invoke(context, term11501, t_4187);
        if(term == null)
          break Fail21374;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}