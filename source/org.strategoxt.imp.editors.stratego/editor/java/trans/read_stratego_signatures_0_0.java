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

@SuppressWarnings("all") public class read_stratego_signatures_0_0 extends Strategy 
{ 
  public static read_stratego_signatures_0_0 instance = new read_stratego_signatures_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("read_stratego_signatures_0_0");
    Fail21658:
    { 
      IStrategoTerm n_4234 = null;
      IStrategoTerm o_4234 = null;
      IStrategoTerm p_4234 = null;
      o_4234 = term;
      IStrategoTerm term11758 = term;
      Success11665:
      { 
        Fail21659:
        { 
          term = fetch_library_ast_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21659;
          p_4234 = term;
          if(true)
            break Success11665;
        }
        term = term11758;
        IStrategoTerm x_4234 = null;
        x_4234 = term;
        term = guarantee_extension_0_1.instance.invoke(context, x_4234, trans.const4368);
        if(term == null)
          break Fail21658;
        n_4234 = term;
        Success11666:
        { 
          Fail21660:
          { 
            IStrategoTerm q_4234 = null;
            q_4234 = term;
            IStrategoTerm term11760 = term;
            Success11667:
            { 
              Fail21661:
              { 
                term = termFactory.makeTuple(n_4234, o_4234);
                term = is_newer_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21661;
                if(true)
                  break Success11667;
              }
              term = term11760;
              Success11668:
              { 
                Fail21662:
                { 
                  IStrategoTerm term11762 = term;
                  Success11669:
                  { 
                    Fail21663:
                    { 
                      term = file_exists_0_0.instance.invoke(context, o_4234);
                      if(term == null)
                        break Fail21663;
                      { 
                        if(true)
                          break Fail21662;
                        if(true)
                          break Success11669;
                      }
                    }
                    term = term11762;
                  }
                  if(true)
                    break Success11668;
                }
                IStrategoTerm z_4234 = null;
                z_4234 = o_4234;
                term = has_extension_0_1.instance.invoke(context, z_4234, trans.const4368);
                if(term == null)
                  break Fail21660;
              }
            }
            term = q_4234;
            { 
              term = file_exists_0_0.instance.invoke(context, n_4234);
              if(term == null)
                break Fail21658;
              term = $Read$From$File_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21658;
              p_4234 = term;
              if(true)
                break Success11666;
            }
          }
          term = parse_stratego_file_0_0.instance.invoke(context, o_4234);
          if(term == null)
            break Fail21658;
          p_4234 = term;
        }
      }
      term = to_signatures_0_0.instance.invoke(context, p_4234);
      if(term == null)
        break Fail21658;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}