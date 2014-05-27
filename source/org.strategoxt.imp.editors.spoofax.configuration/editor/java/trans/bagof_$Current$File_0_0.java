package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bagof_$Current$File_0_0 extends Strategy 
{ 
  public static bagof_$Current$File_0_0 instance = new bagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentFile_0_0");
    Fail22998:
    { 
      TermReference n_4641 = new TermReference();
      if(n_4641.value == null)
        n_4641.value = term;
      else
        if(n_4641.value != term && !n_4641.value.match(term))
          break Fail22998;
      Success12223:
      { 
        Fail22999:
        { 
          IStrategoTerm q_4641 = null;
          IStrategoTerm s_4641 = null;
          IStrategoTerm t_4641 = null;
          s_4641 = term;
          q_4641 = trans.const4485;
          t_4641 = s_4641;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4641, q_4641, trans.constCons2047);
          if(term == null)
            break Fail22999;
          if(true)
            break Success12223;
        }
        term = trans.constNil4;
      }
      lifted6901 lifted69010 = new lifted6901();
      lifted69010.n_4641 = n_4641;
      term = filter_1_0.instance.invoke(context, term, lifted69010);
      if(term == null)
        break Fail22998;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}