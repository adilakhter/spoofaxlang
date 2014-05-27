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

@SuppressWarnings("all") public class to_tiny_string_0_0 extends Strategy 
{ 
  public static to_tiny_string_0_0 instance = new to_tiny_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_tiny_string_0_0");
    Fail25550:
    { 
      IStrategoTerm e_4236 = null;
      IStrategoTerm term10092 = term;
      Success10070:
      { 
        Fail25551:
        { 
          term = to_tiny_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25551;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25551;
          term = termFactory.makeTuple(generator.const7067, term, generator.const7068);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25551;
          if(true)
            break Success10070;
        }
        term = term10092;
        IStrategoTerm cons315 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        e_4236 = cons315;
        IStrategoTerm args42 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        term = args42;
        IStrategoTerm term10093 = term;
        Success10071:
        { 
          Fail25552:
          { 
            IStrategoTerm f_4236 = null;
            f_4236 = term;
            IStrategoTerm term10094 = term;
            Success10072:
            { 
              Fail25553:
              { 
                if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                  break Fail25553;
                if(true)
                  break Success10072;
              }
              term = _0_0.instance.invoke(context, term10094);
              if(term == null)
                break Fail25552;
            }
            term = f_4236;
            { 
              term = strip_annos_0_0.instance.invoke(context, e_4236);
              if(term == null)
                break Fail25550;
              IStrategoTerm term10095 = term;
              Success10073:
              { 
                Fail25554:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25554;
                  if(true)
                    break Success10073;
                }
                term = write_to_string_0_0.instance.invoke(context, term10095);
                if(term == null)
                  break Fail25550;
              }
              if(true)
                break Success10071;
            }
          }
          term = term10093;
          term = to_tiny_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25550;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25550;
          term = termFactory.makeTuple(e_4236, generator.const7069, term, generator.const7047);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25550;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}