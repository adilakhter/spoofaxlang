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

@SuppressWarnings("all") public class bigbagof_$Current$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$File_0_0 instance = new bigbagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentFile_0_0");
    Fail22993:
    { 
      TermReference n_4640 = new TermReference();
      if(n_4640.value == null)
        n_4640.value = term;
      else
        if(n_4640.value != term && !n_4640.value.match(term))
          break Fail22993;
      Success12221:
      { 
        Fail22994:
        { 
          IStrategoTerm q_4640 = null;
          IStrategoTerm s_4640 = null;
          IStrategoTerm t_4640 = null;
          s_4640 = term;
          q_4640 = trans.const4485;
          t_4640 = s_4640;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, t_4640, q_4640, trans.constCons2047);
          if(term == null)
            break Fail22994;
          if(true)
            break Success12221;
        }
        term = trans.constNil4;
      }
      lifted6898 lifted68980 = new lifted6898();
      lifted68980.n_4640 = n_4640;
      term = filter_1_0.instance.invoke(context, term, lifted68980);
      if(term == null)
        break Fail22993;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}