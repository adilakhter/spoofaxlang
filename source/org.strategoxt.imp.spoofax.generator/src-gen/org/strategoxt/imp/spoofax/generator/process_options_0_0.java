package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class process_options_0_0 extends Strategy 
{ 
  public static process_options_0_0 instance = new process_options_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("process_options_0_0");
    Fail25510:
    { 
      IStrategoTerm t_4227 = null;
      IStrategoTerm u_4227 = null;
      u_4227 = term;
      Success10058:
      { 
        Fail25511:
        { 
          term = get_config_0_0.instance.invoke(context, generator.const7049);
          if(term == null)
            break Fail25511;
          if(true)
            break Success10058;
        }
        term = generator.constNil7;
      }
      term = map_1_0.instance.invoke(context, term, lifted9056.instance);
      if(term == null)
        break Fail25510;
      term = termFactory.makeTuple(term, generator.constCons4606);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25510;
      IStrategoTerm term10079 = term;
      Success10059:
      { 
        Fail25512:
        { 
          IStrategoTerm v_4227 = null;
          v_4227 = term;
          term = get_config_0_0.instance.invoke(context, generator.const7051);
          if(term == null)
            break Fail25512;
          t_4227 = term;
          term = v_4227;
          { 
            IStrategoTerm y_4227 = null;
            IStrategoTerm a_4228 = null;
            IStrategoTerm z_4227 = null;
            IStrategoTerm b_4228 = null;
            a_4228 = term;
            term = dirname_0_0.instance.invoke(context, t_4227);
            if(term == null)
              break Fail25510;
            y_4227 = term;
            term = a_4228;
            b_4228 = a_4228;
            z_4227 = term;
            term = b_4228;
            IStrategoList list371;
            list371 = checkListTail(z_4227);
            if(list371 == null)
              break Fail25510;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consIncludeDir_1, new IStrategoTerm[]{y_4227}), list371);
            if(true)
              break Success10059;
          }
        }
        term = term10079;
        IStrategoTerm c_4228 = null;
        IStrategoTerm d_4228 = null;
        d_4228 = term;
        c_4228 = term;
        term = d_4228;
        IStrategoList list372;
        list372 = checkListTail(c_4228);
        if(list372 == null)
          break Fail25510;
        term = (IStrategoTerm)termFactory.makeListCons(generator.constIncludeDir0, list372);
      }
      term = termFactory.makeTuple(generator.const7049, term);
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25510;
      term = u_4227;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}