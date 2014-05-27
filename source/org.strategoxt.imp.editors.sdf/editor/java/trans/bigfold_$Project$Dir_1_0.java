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

@SuppressWarnings("all") public class bigfold_$Project$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Project$Dir_1_0 instance = new bigfold_$Project$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_92086)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ProjectDir_1_0");
    Fail76173:
    { 
      IStrategoTerm d_92086 = null;
      IStrategoTerm f_92086 = null;
      f_92086 = term;
      Success41820:
      { 
        Fail76174:
        { 
          IStrategoTerm g_92086 = null;
          IStrategoTerm i_92086 = null;
          IStrategoTerm j_92086 = null;
          i_92086 = term;
          g_92086 = trans.const15517;
          j_92086 = i_92086;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_92086, g_92086, trans.constCons7205);
          if(term == null)
            break Fail76174;
          if(true)
            break Success41820;
        }
        term = trans.constNil11;
      }
      d_92086 = term;
      term = f_92086;
      term = termFactory.makeTuple(d_92086, term);
      term = c_92086.invoke(context, term, lifted21605.instance);
      if(term == null)
        break Fail76173;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}