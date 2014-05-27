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

@SuppressWarnings("all") public class chain_$Current$Dir_0_0 extends Strategy 
{ 
  public static chain_$Current$Dir_0_0 instance = new chain_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CurrentDir_0_0");
    Fail76205:
    { 
      IStrategoTerm s_92091 = null;
      IStrategoTerm u_92091 = null;
      u_92091 = term;
      Success41830:
      { 
        Fail76206:
        { 
          IStrategoTerm v_92091 = null;
          IStrategoTerm x_92091 = null;
          IStrategoTerm y_92091 = null;
          x_92091 = term;
          v_92091 = trans.const15515;
          y_92091 = x_92091;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_92091, v_92091, trans.constCons7205);
          if(term == null)
            break Fail76206;
          if(true)
            break Success41830;
        }
        term = trans.constNil11;
      }
      s_92091 = term;
      term = u_92091;
      term = termFactory.makeTuple(s_92091, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21617.instance);
      if(term == null)
        break Fail76205;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}