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

@SuppressWarnings("all") public class bigchain_$Project$Dir_0_0 extends Strategy 
{ 
  public static bigchain_$Project$Dir_0_0 instance = new bigchain_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ProjectDir_0_0");
    Fail76177:
    { 
      IStrategoTerm a_92087 = null;
      IStrategoTerm c_92087 = null;
      c_92087 = term;
      Success41822:
      { 
        Fail76178:
        { 
          IStrategoTerm d_92087 = null;
          IStrategoTerm f_92087 = null;
          IStrategoTerm g_92087 = null;
          f_92087 = term;
          d_92087 = trans.const15517;
          g_92087 = f_92087;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_92087, d_92087, trans.constCons7205);
          if(term == null)
            break Fail76178;
          if(true)
            break Success41822;
        }
        term = trans.constNil11;
      }
      a_92087 = term;
      term = c_92087;
      term = termFactory.makeTuple(a_92087, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21607.instance);
      if(term == null)
        break Fail76177;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}